class Point(val x: Int = -1, val y: Int = -1, var polarAngle: Double = 0.0) {

    fun calcPolarAngle(b: Point) {
        polarAngle = if (x == b.x) Double.NEGATIVE_INFINITY
        else (y - b.y) / (x - b.x).toDouble()
    }

    override fun equals(other: Any?): Boolean {
        other as Point
        return x == other.x && y == other.y
    }

    override fun toString(): String {
        return if (x == -1 || y == -1) ""
        else "\n($x,$y) $polarAngle"

    }


}