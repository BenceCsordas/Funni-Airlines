package com.company.kando;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.FileNotFoundException;

public class FunnyAirlinesTest {

        @BeforeClass
        public static void testBeforeAll() {
                Main.isRunningTest = true;
        }

        @Test
        public void testJaneSmith() throws FileNotFoundException {
                Main.testInputPassangerName = "Jane Smith";
                Main.main(null);

                Assert.assertNotNull(Main.flightPassangerList);
                Assert.assertNotEquals(0, Main.flightPassangerList.size());

                FlightPassanger flightPassanger0 = Main.flightPassangerList.get(0);
                Assert.assertNotNull(flightPassanger0);
                Assert.assertNotNull(flightPassanger0.FlightNumber);
                Assert.assertNotNull(flightPassanger0.PassangerName);
                Assert.assertNotNull(flightPassanger0.PassangerId);
                Assert.assertNotNull(flightPassanger0.Destination);
                Assert.assertNotNull(flightPassanger0.Source);
                Assert.assertNotNull(flightPassanger0.SeatNumber);
                Assert.assertNotNull(flightPassanger0.TicketId);
                Assert.assertNotNull(flightPassanger0.Price);

                FlightPassanger flightPassanger1 = Main.flightPassangerList.get(0);
                Assert.assertNotNull(flightPassanger1);
                Assert.assertNotNull(flightPassanger1.FlightNumber);
                Assert.assertNotNull(flightPassanger1.PassangerName);
                Assert.assertNotNull(flightPassanger1.PassangerId);
                Assert.assertNotNull(flightPassanger1.Destination);
                Assert.assertNotNull(flightPassanger1.Source);
                Assert.assertNotNull(flightPassanger1.SeatNumber);
                Assert.assertNotNull(flightPassanger1.TicketId);
                Assert.assertNotNull(flightPassanger1.Price);

        }
        @Test
        public void testGipszJakab() throws FileNotFoundException {
                Main.testInputPassangerName = "Gipsz Jakab";
                Main.main(null);

                Assert.assertEquals("Gipsz Jakab", Main.testInputPassangerName);
        }

        @Test
        public void testMickeyMouse() throws FileNotFoundException {
                Main.testInputPassangerName = "Mickey Mouse";
                Main.main(null);
        }


        @AfterClass
        public static void testAfterAll() {
                Main.isRunningTest = false;
        }
}
