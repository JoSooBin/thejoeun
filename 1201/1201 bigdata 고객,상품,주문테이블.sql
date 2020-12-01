-- ���̺� ����
CREATE table shoping (
	ordno int ,
	orddate datetime,
	prdname char(5),
	salprice int
);
-- �� ���̺� ����
CREATE table customers (
	custid 	varchar(16) primary key,
	name 	varchar(10),
	age 	int,
	grade 	varchar(10),
	job 	varchar(10),
	points 	int
);

-- ��ǰ���̺�
create table product (
	prodno 	char(4) primary key,
	prdname varchar(10),
	stock 	int, 
	price 	int,
	prdmaker varchar(10)
);

-- �ֹ� ���̺� 
create table orders ( 
	ordno int primary key,
	custid 	varchar(16), -- �����̺� pk
	prodno char(4), -- ��ǰ���̺� pk
	qty int,
	addr varchar(20),
	orddate datetime
);

-- �ܷ�Ű ����
-- foreign key (�÷���)
-- references ���̺��(�÷���);
-- �ֹ� - �� ���̺� ���� ����
-- �ֹ� - ��ǰ ���̺� ���� ����
create table orders2 ( -- �ֹ�/�� �ܷ�Ű ���� 
	ordno int primary key,
	custid 	varchar(16), -- �����̺� pk
	prodno char(4), -- ��ǰ���̺� pk
	qty int,
	addr varchar(20),
	orddate datetime,
	foreign key (custid)
	references customers (custid)
);

create table orders3 ( -- �ֹ�/��ǰ �ܷ�Ű ���� 
	ordno int primary key,
	custid 	varchar(16), -- �����̺� pk
	prodno char(4), -- ��ǰ���̺� pk
	qty int,
	addr varchar(20),
	orddate datetime,
	foreign key (prodno) references product (prodno)
);

create table orders4 ( -- �ֹ�/��ǰ/�� �ܷ�Ű ���� 
	ordno int primary key,
	custid 	varchar(16), -- �����̺� pk
	prodno char(4), -- ��ǰ���̺� pk
	qty int,
	addr varchar(20),
	orddate datetime,
	foreign key (custid) references customers (custid),
	foreign key (prodno) references product (prodno)
);
-- �� �ܷ�Ű�� �����Ҷ����� ���̺� ���������� �����ؾ� ��!
-- �� -> ��ǰ -> �ֹ�
