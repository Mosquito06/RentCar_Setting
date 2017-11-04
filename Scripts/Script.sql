create table product(
	pCode char(4) primary key,
	pName char(5) not null
);

create table Coffee(
	pCode char(4),
	pName char(5),
	pPrice int,
	pTotal int,
	pMargin int,
	primary key(pCode),
	foreign key(pCode) references product(pCode)
	
);

create table Income(
	pCode char(4),
	sPrice int,
	sTax int,
	oPrice int,
	pMargin int,
	primary key(pCode),
	foreign key(pCode) references product(pCode)
);





