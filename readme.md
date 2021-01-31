#트러블슈팅

## 1.Intellij 한글 깨짐 문제
1. shift + shift 두번 누름
2. edit custom vm option 선택
3. 아래내용 추가
```
-Dfile.encoding=UTF-8 
```

## 2. Intellij gradle 문제
1. 아래내용 입력
```aidl
dependencies {
    testImplementation 'org.junit.jupiter:junit-jupiter-api:5.6.0'
    testRuntimeOnly 'org.junit.jupiter:junit-jupiter-engine'
    compile group: 'org.hibernate', name: 'hibernate-gradle-plugin', version: '5.4.27.Final'
    compile group: 'mysql', name: 'mysql-connector-java', version: '8.0.23'
}
```
2. side Menu Gradle 에서 Reload Gradle Project 선택 
3. dependency 항목 자동 다운로드.


## 3. Hibernate 
1. 실행은 되는데 테이블 만들어 지지 않음. => 아래 넣어 줌.
```aidl
<class>com.demo.sk.jpa.Member</class>
```

2. to use near 'type = `MyISAM`' at line 1 발생
```aidl
<property name="hibernate.dialect" value="org.hibernate.dialect.MySQL8Dialect" />
```
