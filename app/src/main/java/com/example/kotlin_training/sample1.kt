package com.example.kotlin_training

// 시작함수
fun main() {
 // 3. String Template
//    val name = "Joyce";
//    val lastName = "Hong";
//    println("my name is ${name + lastName} I'm 23")
//    println("is this true? ${1==0}")
//    println("this is 2\$a")

    checkNum(1)

}

// 4. 조건식
fun maxBy(a : Int, b: Int) : Int {
    if ( a > b ) {
        return a;
    } else {
        return b;
    }

}
// 코틀린은 위에랑일치하게 다르게 표현가능
// 삼항연산자를 대신해서 표현
fun mayBy2(a: Int, b:Int) : Int = if(a>b) a else b

// if만큼 쓰는게 when
fun checkNum(score: Int): Unit {
    when(score) {
        0 -> println("this is 0")
        1 -> println("this is 1")
        2,3 -> println("this is 2 or 3")
        else -> println("i don't know")
    }

    var b:Int = when(score)  {
        1 -> 1
        2 -> 2
        else -> 3
    }
    println("b : ${b}")

    // 점수 주기
    when(score) {
        in 90..100 -> println("You are geius")
        in 10..80 -> println("not bad")
        else -> println("okay")
    }
}

// 1. 함수
// 뭘 리턴하든 앞에 fuc
// retunrn이 없을때 Unit === void 와 동일
// return 타입이 없다면 Unit 생략해도 무관
fun helloWorld() : Unit {
    println("Hello World")
}

// return 값이 있는 경우
// 변수가 뒤에 온다.
// 변수 이름을 먼저쓰고 타입 나중에
// Java와 다른점 Int에 I가 대문자
// 무언가를 리턴한다면 return 타입을 뒤에 지정해야함

// 기본적으로 변수명을 타입보다 먼저쓰고 리턴 타입은 파라미터를 쓴다음에 지정
fun add(a : Int, b: Int): Int {
   return a + b;
}


// 2. val vs var
// var = value 값이 바뀌지 않음
fun hi() {
    // 변하지 않는값
    // val === const 와 동일
    // 자동 추론
    val a : Int = 10

   //  var e // 불가능

//   var e : string

    // 변할수 있는값
    var b : Int = 9

    // a = 100 // 불가능
    b = 200

    // 자동으로 타입 추론
    // val 인지 var인지만 구분해서 써줘야함
    val c = 100
    var d = 100
    var name = "ho"


}


// Expression vs Statement
// 값을 만들면 Expression 실행할때는 Statement
// 코틀린의 모든 함수는 Expression 으로 사용
// 명령같은 문장은 Statement

// 5.Array and List

// Array

// List 1 IMutableList : 수정 불가능 , List 2. MutableList = 수정 가능
fun array() {
    val array = arrayOf(1,2,3)
    val list = listOf(1,2,3)

    // 타입 추론
    val array2 = arrayOf(1,"d", 3.4f)
    val list2 = listOf(1,"d", 11L)

    array[0] = 3
    var result = list.get(0)

    val arrayList: ArrayList<Int> = arrayListOf<Int>()
    // list a list B
    // 주소 자체는 바뀌지 않음
    arrayList.add(10)
    arrayList.add(20)

    // 참조값이 바뀌는 경우
    // 다시 할당될 수 없음
    // arrayList = arrayListOf() == 불가능

}
