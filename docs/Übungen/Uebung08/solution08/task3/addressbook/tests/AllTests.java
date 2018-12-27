package addressbook.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Add JUnit [4] library to Java Build Path.
 * Start with Run as - JUnit Test.
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({ TestAddressBook.class, TestContact.class })
public class AllTests {
}
