fun findStartingPoint(p: Plane):Point {


    for (i in (p.r)-1 downTo 0){
        for (j in 0 until p.c){
            if(p.plane[i][j]!= Point()) {
                return p.plane[i][j]
            }
        }
    }

    return Point()

}