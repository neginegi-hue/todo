CREATE TABLE todos (
    id SERIAL PRIMARY KEY,
    todo boolean not null,
    task varchar(100) not null,
    limitdate date not null
);