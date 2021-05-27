DROP TABLE SAMPLE;

CREATE TABLE SAMPLE (
	ID VARCHAR2(12) PRIMARY KEY,
	TITLE VARCHAR2(200),
	REG_USER VARCHAR2(20),
	CONTENT VARCHAR2(2000),
	REG_DATE DATE DEFAULT SYSDATE
);

INSERT INTO SAMPLE VALUES('SAMPLE-00001', 'JAVA Programming', '관리자', 'JAVA 관련 글만 등록하세요.', SYSDATE);

CREATE TABLE IDS (
	TABLE_NAME VARCHAR2(16) PRIMARY KEY,
	NEXT_ID NUMBER(30) NOT NULL
);

INSERT INTO IDS VALUES('SAMPLE', 2);

SELECT * FROM IDS;
SELECT * FROM SAMPLE;