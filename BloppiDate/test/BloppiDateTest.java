import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BloppiDateTest {
    @Rule
    public ExpectedException thrown= ExpectedException.none();

    @Test
    public void shouldGiveDayZero(){
        BloppiDate date = new BloppiDate(0,0,0);
        assertThat(date.toString(), is("0/0/0"));
    }

    @Test
    public void shouldPrintDateCorrectly(){
        BloppiDate date = new BloppiDate(3,2,1);
        assertThat(date.toString(), is("1/2/3"));
    }

    @Test
    public void shouldAcceptNegativeYear(){
        BloppiDate date = new BloppiDate(-3,2,1);
        assertThat(date.toString(), is("1/2/-3"));
    }

    @Test
    public void shouldComplainIfMonthTooHigh(){
        thrown.expect(IllegalArgumentException.class);
        new BloppiDate(0,12,0);
    }

    @Test
    public void shouldComplainIfMonthTooLow(){
        thrown.expect(IllegalArgumentException.class);
        new BloppiDate(0,-1,0);
    }

    @Test
    public void shouldComplainIfDayTooHigh(){
        thrown.expect(IllegalArgumentException.class);
        new BloppiDate(0,0,30);
    }

    @Test
    public void shouldComplainIfDayTooLow(){
        thrown.expect(IllegalArgumentException.class);
        new BloppiDate(0,0,-1);
    }

    @Test
    public void shouldBeAbleToAddOneDat(){
        BloppiDate date = new BloppiDate(0,0,0).AddDays(1);
        assertThat(date.toString(), is("1/0/0"));
    }

    @Test
    public void shouldBeAbleToAddOneMonth(){
        BloppiDate date = new BloppiDate(0,0,0).AddDays(30);
        assertThat(date.toString(), is("0/1/0"));
    }

    @Test
    public void shouldBeAbleToAddOneYear(){
        BloppiDate date = new BloppiDate(0,0,0).AddDays(360);
        assertThat(date.toString(), is("0/0/1"));
    }

    @Test
    public void shouldBeAbleToAddOneDayMonthAndYear(){
        BloppiDate date = new BloppiDate(0,0,0).AddDays(391);
        assertThat(date.toString(), is("1/1/1"));
    }

    @Test
    public void shouldBeAbleToGiveDifferenceOfOneDay(){
        int difference = new BloppiDate(0,0,0).DiffDays(new BloppiDate(0,0,1));
        assertThat(difference, is(1));
    }

    @Test
    public void shouldBeAbleToGiveDifferenceOfNegativeOneDay(){
        int difference = new BloppiDate(0,0,1).DiffDays(new BloppiDate(0,0,0));
        assertThat(difference, is(-1));
    }

    @Test
    public void shouldBeAbleToGiveDifferenceOfOneMonth(){
        int difference = new BloppiDate(0,0,0).DiffDays(new BloppiDate(0,1,0));
        assertThat(difference, is(30));
    }

    @Test
    public void shouldBeAbleToGiveDifferenceOfNegativeOneMonth(){
        int difference = new BloppiDate(0,1,0).DiffDays(new BloppiDate(0,0,0));
        assertThat(difference, is(-30));
    }

    @Test
    public void shouldBeAbleToGiveDifferenceOfOneYear(){
        int difference = new BloppiDate(0,0,0).DiffDays(new BloppiDate(1,0,0));
        assertThat(difference, is(360));
    }

    @Test
    public void shouldBeAbleToGiveDifferenceOfNegativeOneYear(){
        int difference = new BloppiDate(1,0,0).DiffDays(new BloppiDate(0,0,0));
        assertThat(difference, is(-360));
    }

    @Test
    public void shouldBeAbleToGiveDifferenceOfOneYearMonthDay(){
        int difference = new BloppiDate(0,0,0).DiffDays(new BloppiDate(1,1,1));
        assertThat(difference, is(391));
    }

    @Test
    public void shouldBeAbleToGiveDifferenceOfNegativeOneYearMonthDay(){
        int difference = new BloppiDate(1,1,1).DiffDays(new BloppiDate(0,0,0));
        assertThat(difference, is(-391));
    }
}
