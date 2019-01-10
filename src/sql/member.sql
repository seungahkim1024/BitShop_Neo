SELECT * FROM member;
--계정생성
CREATE USER oracle IDENTIFIED BY password;

oracle/password -> 새로 만드는 아이디.

--권한부여
GRANT RESOURCE, CONNECT, DBA TO oracle;
-- 나가기
EXIT;
-- 다시 DB로 들어가기
sqlplus oracle/password (SQL이 아닌 윈도우에서 해야함)

그다음 잘 만들어졌는지 확인하기 위해, SHOW USER;

SELECT * FROM TAB; -> 방금 만든 ID라서 no rows selected.

-- 테이블 생성
CREATE TABLE member(
    id VARCHAR2(10), name VARCHAR2(10), 
  pass VARCHAR2(10), ssn VARCHAR2(14) -> bean객체와 맞춰준다.
);
-- 테이블 확인
SELECT * FROM TAB;
-- 테이블 삭제하기.
DROP TABLE member;

-- 인스턴스 생성 == DB에서 한 row를 추가하는 것.
INSERT INTO member(id, name, pass, ssn)
VALUES('hong', '홍길동', '1', '900101-1234567');