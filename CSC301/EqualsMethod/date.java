/******************************************************************************
 *  @author: Elona Selenica
 *  Question
 *  Override the equals methods for the Date object 
 *  Date()
 * private int year;
 * private String month;
 * private int day;
 ******************************************************************************/
public boolean equals(Date that){
    if(this == that) return true;
    if (that ==null) return false;
    if(that.getClass() != this.getClass())
        return false;

    if(this day != that.day) return false;
    if(this.month.equals(that.month)) return false;
    if(this.year != that.year) return false;
    return true;
}
