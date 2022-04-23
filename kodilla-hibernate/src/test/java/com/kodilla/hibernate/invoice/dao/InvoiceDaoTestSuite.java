package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private ProductDao productDao;
    @Autowired
    private ItemDao itemDao;
    @Autowired
    private InvoiceDao invoiceDao;

    public static final String NUMBER= "FV1111111";

    @Test
    void testInvoiceDaoSave() {
        //Given
        Product computer= new Product("Computer DELL");
        Product console= new Product("PlayStation 5");
        Product phone= new Product("Samsung S20");

        Item item1= new Item(computer,new BigDecimal(5000),4);
        Item item2= new Item(console,new BigDecimal(3000),5);
        Item item3= new Item(phone,new BigDecimal(4000),10);

        computer.getItems().add(item1);
        console.getItems().add(item2);
        phone.getItems().add(item3);

        Invoice invoice= new Invoice(NUMBER);
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);

        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);

        //When
        productDao.save(computer);
        productDao.save(console);
        productDao.save(phone);
        invoiceDao.save(invoice);
        itemDao.save(item1);
        itemDao.save(item2);
        itemDao.save(item3);
        int invoiceId= invoice.getId();

        //Then
        assertNotEquals(0,invoiceId);

        //CleanUp
        try {
            productDao.delete(computer);
            productDao.delete(console);
            productDao.delete(phone);
            itemDao.delete(item1);
            itemDao.delete(item2);
            itemDao.delete(item3);
            invoiceDao.delete(invoice);
        } catch (Exception e) {
            //do nothing
        }
    }
}
