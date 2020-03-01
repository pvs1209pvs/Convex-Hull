fun main() {

    val p = Plane(4,4)
    p.addRandomPoints((p.r*p.c)/2)
    println(p)

    println("lowest point ${findStartingPoint(p)} \n")

    grahamScan(p)


}