fun main() {

    val p = Plane(5,5)

    p.addRandomPoints((p.r*p.c)/2)

    println(p)

    println(findStartingPoint(p))

}