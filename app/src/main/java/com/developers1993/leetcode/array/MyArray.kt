package com.developers1993.leetcode.array

class MyArray {
    private var data: Array<Any?> = arrayOfNulls<Any?>(10)
    private var size = 0

    fun add(item: Any) {
        if (size == data.size) {
            resizeArray()
        }
        data[size] = item
        size++
    }

    fun get(position: Int): Any? {
        throwExceptionIfRequired(position)
        return data[position]
    }



    fun remove(position: Int) : Any? {
        throwExceptionIfRequired(position)
        val item = data[position]
        for (i in position until size-1){
            data[i] = data[i+1]
        }
        data[size-1] = null
        size--
        return item
    }

    private fun resizeArray() {
        val newarray: Array<Any?> = arrayOfNulls(data.size * 2)
        System.arraycopy(newarray, 0, data, 0, data.size)
        data = newarray

    }

    fun size(): Int {
        return size
    }

    private fun throwExceptionIfRequired(position: Int) {
        if (position >= size || position<0) {
            throw IndexOutOfBoundsException("index: $position, Size: $size")
        }
    }
}

fun main() {
    val arr = MyArray()
    arr.add("Hello")
    arr.add("World")
    println("before :  "+arr.size())
    arr.remove(1)

   // println("after : "+arr.get(1))
    println(arr.size())
}
