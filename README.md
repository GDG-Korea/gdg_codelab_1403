gdg_codelab_1403
================

2014년 3월 GDG Codelab용 코드 저장소입니다.

# 실행하는 법
## 온라인 사이트 이용
http://www.compileonline.com/compile_java_online.php

## 터미널에서 실행
``` java Fibonacci <number> ```

* 실행 예제
```
$ java Fibonacci 4
F0 = 0, F1 = 1, F2 =  1
F1 = 1, F2 = 1, F3 =  2
F2 = 1, F3 = 2, F4 =  3
```

## jvm 사용
```sh
javac Fibonacci.java 2>&1
java -Xmx128M -Xms16M Fibonacci [:input]
```
