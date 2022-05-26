def fact(x: Int): Int = {
    if (x == 1) 1
    else x * fact(x -1)
}

println("階乗=" + fact(5))