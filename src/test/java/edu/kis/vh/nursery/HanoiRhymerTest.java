package edu.kis.vh.nursery;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class HanoiRhymerTest {

    private HanoiRhymer rhymer;

    @Before
    public void setUp() {
        rhymer = new HanoiRhymer();
    }

    @Test
    public void testCountInWithAcceptedValue() {
        rhymer.countIn(3);
        assertEquals(3, rhymer.peekaboo());
    }

    @Test
    public void testCountInWithRejectedValue() {
        rhymer.countIn(3);
        rhymer.countIn(5);
        assertEquals(1, rhymer.reportRejected());
    }

    @Test
    public void testReportRejected() {
        rhymer.countIn(3);
        rhymer.countIn(2);
        rhymer.countIn(4);
        rhymer.countIn(1);
        assertEquals(1, rhymer.reportRejected());
    }
}