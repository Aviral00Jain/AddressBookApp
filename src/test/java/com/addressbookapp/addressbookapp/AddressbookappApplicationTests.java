package com.addressbookapp.addressbookapp;

import com.addressbookapp.service.AddressBook;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class AddressBookAppApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void testLoadContactsFromDB() {
		AddressBook ab = new AddressBook();
		ab.loadContactsFromDB();
		assertNotNull(ab.getContacts());
		assertTrue(ab.getContacts().size() >= 0);
	}

}