CREATE TABLE BOOK (
  book_id SERIAL,
  title varchar(255) not null,
  price double precision not null,
  isbn varchar(255) not null,
  primary key (book_id)
);
