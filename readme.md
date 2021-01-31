## 환경
### mysql : 8.x
- mysql version 별로 차이 큼. 
#### mysql timezone 셋팅
- 파일 다운로드 후 적당한 곳에 저장 
```
  https://dev.mysql.com/downloads/timezones.html (timezone_2021a_leaps_sql.zip - Non POSIX with leap seconds)
```
- mysql> source <저장경로>timezone_leaps.sql 실행
- mysql> show variables where Variable_name like "%dir";
- my.ini 위치 확인
- default-time-zone=Asia/Seoul 추가
- 참고 : https://hunda.tistory.com/entry/MySQL-Windows-%EC%97%90%EC%84%9C-Timezone-%EC%84%A4%EC%A0%95%ED%95%98%EA%B8%B0


### #jdk 11.x (openjdk)
- 8, 11, 15 가 많이 쓰임

##트러블슈팅

### 1.Intellij 한글 깨짐 문제
1. shift + shift 두번 누름
2. edit custom vm option 선택
3. 아래내용 추가
```
-Dfile.encoding=UTF-8 
```

### 2. Intellij gradle 문제
1. 아래내용 입력
```
dependencies {
    testImplementation 'org.junit.jupiter:junit-jupiter-api:5.6.0'
    testRuntimeOnly 'org.junit.jupiter:junit-jupiter-engine'
    compile group: 'org.hibernate', name: 'hibernate-gradle-plugin', version: '5.4.27.Final'
    compile group: 'mysql', name: 'mysql-connector-java', version: '8.0.23'
}
```
2. side Menu Gradle 에서 Reload Gradle Project 선택 
3. dependency 항목 자동 다운로드.


### 3. Hibernate 
1. 실행은 되는데 테이블 만들어 지지 않음. => 아래 넣어 줌.
```
<class>com.demo.sk.jpa.Member</class>
```

2. to use near 'type = `MyISAM`' at line 1 발생
```
<property name="hibernate.dialect" value="org.hibernate.dialect.MySQL8Dialect" />
```
