package com.example.kotlin_training

// 시작함수
fun main() {
  helloWorld()

    println(add(3 , 5))
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



