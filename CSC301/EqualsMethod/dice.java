/******************************************************************************
 *  @author: Elona Selenica
 *  Question
 *  Override the equals methods for the Dice object 
 *  Dice()
 * private int getDie1()
 * private int getDie2();
 ******************************************************************************/
    public boolean equals(Object o2){
        if(this == o2) return true;
        if(o2 == null) return false;
        if(this.getClass() != o2.getClass()) return false;
        Dice d = (Dice) o2;
        if(d.getDie1() != this.getDie1()) 
            return false;
        if(d.getDie2() != this.getDie2()) 
            return false; 
        return true;
    }