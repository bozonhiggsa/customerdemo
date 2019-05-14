CREATE TABLE db_for_spring_rest.public.customers
(
  ID serial NOT NULL,
  first_name character varying(50) NOT NULL,
  last_name character varying(100) NOT NULL,
  address character varying(1000) NOT NULL,
  budget DECIMAL NOT NULL,
  CONSTRAINT ID PRIMARY KEY (ID)
)
WITH (
OIDS = FALSE
)
;