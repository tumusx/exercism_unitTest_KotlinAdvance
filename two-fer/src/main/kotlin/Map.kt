internal fun mapFilter(){
    val listMap = listOf(2, 3, 4, 9, 8, 12, 6, 8, 8, 9, 9, 12, 21, 21)
    val listFilter = listOf(2, 6, 3, 4, 2, 6, 3, 4, 8, 6, 12)
    val filterList = listFilter.filter { it == 4 }

    filterList.forEach {
        println(it)
    }

    val mapList = listMap.map { it * it}

    for (typeList: Int in mapList){
        print("[$typeList]")
    }


}

fun main(){
    mapFilter()
}