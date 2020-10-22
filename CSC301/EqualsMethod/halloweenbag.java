/******************************************************************************
 *  @author: Elona Selenica
 *  Question
 *  Override the equals methods for the Date object 
 *  Date()
 * private String name;
 * private String favoriteCandy;
 * private int numberOfCandy;
 ******************************************************************************/

public boolean equals(Object o2){
    if(this == o2) return true;
    if(o2 == null) return false;
    if(this.getClass() != o2.getClass()) return false;
    HalloweenBag b = (HalloweenBag) o2;
    if(!b.name.equals(this.name)) 
        return false;
    if(!b.favoriteCandy.equals(this.favoriteCandy)) 
        return false; 
    if(b.numberOfCandy != this.numberOfCandy) 
        return false; 
    return true;
}