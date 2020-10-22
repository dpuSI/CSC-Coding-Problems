/******************************************************************************
 *  @author: Elona Selenica
 *  Question
 *  Override the equals methods for the Person object 
 *  Person()
 *  private String name;
 *  private int age;
 ******************************************************************************/

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (obj.getClass() != this.getClass()) {
            return false;
        }

        Person other = (Person) obj;
        if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
            return false;
        }

        if (this.age != other.age) {
            return false;
        }

        return true;
    }
