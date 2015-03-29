package random;

/* Date.java */

import java.io.*;

class Date {

  /* Put your private data fields here. */
	private int day;
	private int month;
	private int year;
	
  /** Constructs a date with the given month, day and year.   If the date is
   *  not valid, the entire program will halt with an error message.
   *  @param month is a month, numbered in the range 1...12.
   *  @param day is between 1 and the number of days in the given month.
   *  @param year is the year in question, with no digits omitted.
   */
  public Date(int month, int day, int year) {
	  if ( !isValidDate(month,day,year)){
		  throw new Error("Invalid month,day or year specified in the contructor");
		  
	  }else
	  {
		  this.day= day;
		  this.month= month;
		  this.year= year;
	  }
	  
  }

  /** Constructs a Date object corresponding to the given string.
   *  @param s should be a string of the form "month/day/year" where month must
   *  be one or two digits, day must be one or two digits, and year must be
   *  between 1 and 4 digits.  If s does not match these requirements or is not
   *  a valid date, the program halts with an error message.
   */
  public Date(String s) {
	  int date[] = dateStringToArray(s);
	  if( date == null || !isValidDate(date[0],date[1],date[2]))
	  {
		  throw new Error("invalid date[0],date[1],date[2] provided in the constructor");
	  }else{
		  this.month= date[0];
		  this.day=date[1];
		  this.year=date[2];
	  }
  }

  private static int[] dateStringToArray(String s){
	String[] split=s.split("/");
	if(split.length != 3){
		return null;
	}
	int m,d,y;
	try {
		m= Integer.parseInt(split[0]);
		d= Integer.parseInt(split[1]);
		y= Integer.parseInt(split[2]);	
	} catch(NumberFormatException e){
			return null;
		}
	int[] ret={m,d,y};
	return ret;
	}
  
  /** Checks whether the given year is a leap year.
   *  @return true if and only if the input year is a leap year.
   */
  public static boolean isLeapYear(int year) {
	  if( 0 == year % 4){
		  if(0 == year % 100){
			  if(0 == year % 400){
				  return true;
			  } 
			  return false;
		  }return false;
		  
	  }
	  return false;// replace this line with your solution
  }

  /** Returns the number of days in a given month.
   *  @param month is a month, numbered in the range 1...12.
   *  @param year is the year in question, with no digits omitted.
   *  @return the number of days in the given month.
   */
  public static int daysInMonth(int month, int year) {
	  switch(month){
	  case 1:
	  case 3:
	  case 5:
	  case 7:
	  case 8:
	  case 10:
	  case 12:
		  return 31;//break
	  case 2:
		  if (isLeapYear(year)){
			  return 29;
			  
		  }else
		  {
			  return 28;
		  }
	  case 4:
	  case 6:
	  case 9:
	  case 11:
		  return 30;// break
		  default:
			  throw new Error("Invalid month given to daysInMonth()");
	  }                           // replace this line with your solution
  }

  /** Checks whether the given date is valid.
   *  @return true if and only if month/day/year constitute a valid date.
   *
   *  Years prior to A.D. 1 are NOT valid.
   */
  public static boolean isValidDate(int month, int day, int year) {
	if( month > 12 || day < 1 || year < 1 || month < 1 || year>9999 || day > daysInMonth(month,year))  {
		return false;
	}
	else{
		return true;
	}
                            // replace this line with your solution
  }

  /** Returns a string representation of this date in the form month/day/year.
   *  The month, day, and year are expressed in full as integers; for example,
   *  12/7/2006 or 3/21/407.
   *  @return a String representation of this date.
   */
  public String toString() {
    return month + "/" + day + "/" + year;                    // replace this line with your solution
  }

  /** Determines whether this Date is before the Date d.
   *  @return true if and only if this Date is before d. 
   */
  public boolean isBefore(Date d) {
    if( year < d.year || (year == d.year && month < d.month) || ( year ==d.year && month==d.month && day <d.day))
    	{
    	return true;
    	}
    return false;
    // replace this line with your solution
  }

  /** Determines whether this Date is after the Date d.
   *  @return true if and only if this Date is after d. 
   */
  public boolean isAfter(Date d) {
	  if( year > d.year || ( year ==d.year && month > d.month)||( year ==d.year && month ==d.month && day > d.day) )
    {
		  return true;            
  }
  return false;
  }
  
  /* alternate and better way
  public boolean isAfter( Date d){
  if( this.equals(d) || this.isBefore(d)) // we have easily called the method used above adn created a new one for future use....good practice...
  	{
  		return false;
  	}
  return true;
  }
  
  public boolean equals(Date d){
  if (year == d.year && month == d.month && day == d.day) {
            return true;
        }
        return false;
    }
  */

  /** Returns the number of this Date in the year.
   *  @return a number n in the range 1...366, inclusive, such that this Date
   *  is the nth day of its year.  (366 is used only for December 31 in a leap
   *  year.)
   */
  public int dayInYear() {
	  int days=0;
	  for(int i=1; i< month;i++){
		  days += daysInMonth(i,year);
	  }
	  days += day;
	  return days;
	               // replace this line with your solution
  }

  public static int daysInYear(int year){
	  return (new Date(12, 31, year)).dayInYear();
  }
  /** Determines the difference in days between d and this Date.  For example,
   *  if this Date is 12/15/2012 and d is 12/14/2012, the difference is 1.
   *  If this Date occurs before d, the result is negative.
   *  @return the difference in days between d and this date.
   */
  public int difference(Date d) {
    int diff=0;
    if( this.equals(d)){
    		return 0;
    	}// replace this line with your solution
   else if (year == d.year) { // implicit: && !this.equals(d)
      //special case, Dates differ but in the same year.
      return this.dayInYear() - d.dayInYear();
  } else if (this.isAfter(d)) {
      //this year is larger than d.year
      //get d's difference to 12/31/d.year and add it to diff
      Date d_December31st = new Date(12, 31, d.year);
      diff += d_December31st.difference(d);
      //this took care of d.year itself, now add each intervening
      //year's number of days to diff. (starting from d.year + 1)
      for (int yearInBetween = d.year + 1; yearInBetween < this.year; yearInBetween++) {
          diff += daysInYear(yearInBetween);
      }
      //finally add the day of the year 'this' is.
      diff += this.dayInYear();
  } else if (this.isBefore(d)) {
      //this year is smaller than d.year
      //get d's difference to 1/1/d.year and add it to diff (note: it is negative)
      Date d_January1st = new Date(1, 1, d.year);
      diff -= d.difference(d_January1st);
      //this took care of d.year itself, now add each intervening
      //year's number of days to diff. (starting from d.year - 1)
      for (int yearInBetween = d.year - 1; yearInBetween > this.year; yearInBetween--) {
          diff -= daysInYear(yearInBetween);
      }
      //finally add the difference between this and this year's december 31st
      Date this_December31st = new Date(12, 31, this.year);
      diff -= this_December31st.difference(this) + 1; //hmm, off by one, hense +1 here.
  }
  return diff;
    }

  

  public static void main(String[] argv) {
    System.out.println("\nTesting constructors.");
    Date d1 = new Date(1, 1, 1);
    System.out.println("Date should be 1/1/1: " + d1);
    d1 = new Date("2/4/2");
    System.out.println("Date should be 2/4/2: " + d1);
    d1 = new Date("2/29/2000");
    System.out.println("Date should be 2/29/2000: " + d1);
    d1 = new Date("2/29/1904");
    System.out.println("Date should be 2/29/1904: " + d1);

    d1 = new Date(12, 31, 1975);
    System.out.println("Date should be 12/31/1975: " + d1);
    Date d2 = new Date("1/1/1976");
    System.out.println("Date should be 1/1/1976: " + d2);
    Date d3 = new Date("1/2/1976");
    System.out.println("Date should be 1/2/1976: " + d3);

    Date d4 = new Date("2/27/1977");
    Date d5 = new Date("8/31/2110");

    /* I recommend you write code to test the isLeapYear function! */

    System.out.println("\nTesting before and after.");
    System.out.println(d2 + " after " + d1 + " should be true: " + 
                       d2.isAfter(d1));
    System.out.println(d3 + " after " + d2 + " should be true: " + 
                       d3.isAfter(d2));
    System.out.println(d1 + " after " + d1 + " should be false: " + 
                       d1.isAfter(d1));
    System.out.println(d1 + " after " + d2 + " should be false: " + 
                       d1.isAfter(d2));
    System.out.println(d2 + " after " + d3 + " should be false: " + 
                       d2.isAfter(d3));

    System.out.println(d1 + " before " + d2 + " should be true: " + 
                       d1.isBefore(d2));
    System.out.println(d2 + " before " + d3 + " should be true: " + 
                       d2.isBefore(d3));
    System.out.println(d1 + " before " + d1 + " should be false: " + 
                       d1.isBefore(d1));
    System.out.println(d2 + " before " + d1 + " should be false: " +
                       d2.isBefore(d1));
    System.out.println(d3 + " before " + d2 + " should be false: " + 
                       d3.isBefore(d2));

    System.out.println("\nTesting difference.");
    System.out.println(d1 + " - " + d1  + " should be 0: " + 
                       d1.difference(d1));
    System.out.println(d2 + " - " + d1  + " should be 1: " + 
                       d2.difference(d1));
    System.out.println(d3 + " - " + d1  + " should be 2: " + 
                       d3.difference(d1));
    System.out.println(d3 + " - " + d4  + " should be -422: " + 
                       d3.difference(d4));
    System.out.println(d5 + " - " + d4  + " should be 48762: " + 
                       d5.difference(d4));
  }
}