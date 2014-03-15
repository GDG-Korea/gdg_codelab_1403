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

## Coding conventions
* `tab` 대신 `space` 4개를 사용합니다.


## Commit Message
되도록이면 commit 메시지는 영어로 작성해주시기 바랍니다.
```
One line summary
<CRLF>
Detail messages
....
..
````

* One line summary : 간단한 한줄 요약 .
 * 예) Update readme.md file.
* CRLF : 공백 라인
* Detail messges : 자세한 변경 내용
