class Point(val x: Int = -1, val y: Int = -1) {

    override fun equals(other: Any?): Boolean {
        other as Point
        return x == other.x && y == other.y
    }

    override fun toString(): String {

       return if(x==-1 || y==-1) ""
        else "$x,$y"

    }

}