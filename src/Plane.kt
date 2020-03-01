class Plane(val r: Int, val c: Int) {

    val plane = Array(r) { Array(c) { Point() } }
    val points = ArrayList<Point>()

    fun addRandomPoints(n: Int) {
        for (i in 0 until n) {
            val point = Point((0 until r).random(), (0 until c).random())
            if (!points.contains(point)) {
                points.add(point)
                addPoint(point)
            }
        }
    }


    fun addPoint(point: Point) {
        plane[point.x][point.y] = point
    }



    override fun toString(): String {

        val stringBuilder = StringBuilder()

        for (i in plane.indices) {
            for (j in plane[i].indices) {
                if (plane[i][j].toString().length > 1) stringBuilder.append("x")
                else stringBuilder.append(".")
            }
            stringBuilder.append("\n")
        }

        return stringBuilder.toString()

    }

}