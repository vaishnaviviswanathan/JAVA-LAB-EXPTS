use libopac;

drop table IssueDetails;
drop table MemberDetails;
drop table BookDetails;

create table BookDetails(
Title varchar(80),
AccessNo varchar(10) primary key,
Author varchar(80),
Category varchar(20),
Status varchar(20),
constraint StatusChk check Status in('Available','Issued','Transfered')
);

create table MemberDetails(
MemberName varchar(25),
MemberId varchar(10) primary key,
Category varchar(10),
Department varchar(10),
YearOfStudy varchar(10),
IssuedCount int(4),
constraint CategoryChk check Category in('Student','Staff')
);

create table IssueDetails(
BookAccessNo varchar(20) references BookDetails(AccessNo),
MemberId varchar(20) references MemberDetails(MemberId),
constraint IssueCheck primary key(BookAccessNo,MemberId),
IssueDate varchar(20),
ReturnDate varchar(20),
Fine int(5)
);

INSERT INTO BookDetails VALUES('THEORY OF COMPUTATION',100,'BALASUBRAMANIYAM','SUBJECT','Available');
INSERT INTO BookDetails VALUES('JAVA PROGRAMMING PARADIGMS ',101,' CAY HORSTMAN','SUBJECT','Available');
INSERT INTO BookDetails VALUES('DATA STRUCTURES',102,'MARK ALAN WEISS','SUBJECT','Available');
INSERT INTO BookDetails VALUES('OBJECT ORIENTED CONCEPTS',103,'BHUSHAN TRIVEDI','SUBJECT','Available');
INSERT INTO BookDetails VALUES('Computer Networks',140,'Connel','SUBJECT','Issued');


INSERT INTO MemberDetails VALUES('GAYATHRI',200,'Student','CSE',2010,1);
INSERT INTO MemberDetails VALUES('RAM',201,'Student','IT',2010,3);


INSERT INTO IssueDetails VALUES(101,200,'2012-8-25','2012-9-12',0);
INSERT INTO IssueDetails VALUES(102,200,'2012-8-25','2012-9-12',0);
INSERT INTO IssueDetails VALUES(140,200,'2012-8-25','2012-9-12',0);
