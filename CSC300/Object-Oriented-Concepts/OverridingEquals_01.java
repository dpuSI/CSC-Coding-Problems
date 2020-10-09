// Polina

public boolean equals(Object that) {
    if (this==that) return true;
    if (that==null) return false;
    if (that.getClass() != this.getClass()) return false;
    Point p= (Point) that;

    if(this.x != that.x || this.y !=that.y) return false;
    return true;
}
