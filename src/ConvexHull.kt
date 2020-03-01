import java.util.*
import kotlin.math.min

fun grahamScan(p: Plane) {

    val stack = Stack<Point>()
    val polarAngles: MutableList<Point> = sortByPolarAngle(p)


    for (i in 0 until 3)
    stack.push(polarAngles.removeAt(i))




}

fun sortByPolarAngle(p: Plane): MutableList<Point> {

    val polarAngles = ArrayList<Point>()
    val lowestPoint = findStartingPoint(p)

    lowestPoint.calcPolarAngle(lowestPoint)
    polarAngles.add(lowestPoint)

    for (x in p.points) {
        if(x != lowestPoint) {
            x.calcPolarAngle(lowestPoint)
            polarAngles.add(x)
        }
    }

    polarAngles.sortWith(Comparator { a, b -> a.polarAngle.compareTo(b.polarAngle) })

    return polarAngles
}

/**
 * @return
 * equal to collinear,
 * greater than 0 clockwise/right angle,
 * less than 0 anticlockwise/left angle.
 */
fun turnFinder(r: Point, q: Point, p: Point): Double = (r.x - q.x) * (q.y - p.y) - (q.x - p.x) * (r.y - q.y).toDouble()

fun findStartingPoint(p: Plane): Point {

    for (i in (p.r) - 1 downTo 0) {
        for (j in 0 until p.c) {
            if (p.plane[i][j] != Point()) {
                return p.plane[i][j]
            }
        }
    }

    return Point()

}