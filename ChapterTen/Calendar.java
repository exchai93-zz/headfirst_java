// Getting an instance of a concrete Calendar subclass
Calendar cal = Calendar.getInstance();
// Set time to Jan 7, 2004 at 15.40
cal.set(2004,0,7,15,40);
// Convert amount to milliseconds
long day1 = cal.getTimeInMillis();
day1 += 1000 * 60 *60
// Add an hour's worth of millis, then update the time
cal.setTimeInMilis(day1);
System.out.println("new hour " + cal.get(cal.HOUR_OF_DAY));
// Add 35 days to the date, which should move us into February
cal.add(cal.DATE, 35);
System.out.println("add 35 days " + cal.getTime());
// "roll" 35 days onto this date. This "rolls" the date ahead 35 days, but DOES NOT change the month!
cal.roll(cal.DATE, 35);
System.out.println("roll 35 days " + cal.getTime());
// Just doing a "set" of the date
cal.set(cal.DATE, 1);
System.out.println("set to 1 " + cal.getTime());
