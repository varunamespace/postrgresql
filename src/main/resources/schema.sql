DROP TABLE IF EXISTS "books";
DROP TABLE IF EXISTS "authors";

CREATE TABLE "authors" (
    "id" BIGINT DEFAULT nextval('authors_id_seq') NOT NULL,
    "name" TEXT,
    "age" INTEGER,
    CONSTRAINT "authors_pkey" PRIMARY KEY ("id")
);

CREATE TABLE "books" (
    "id" TEXT NOT NULL,
    "title" TEXT,
    "author_id" BIGINT,
    CONSTRAINT "books_pkey" PRIMARY KEY ("id"),
    CONSTRAINT "authors_fkey" FOREIGN KEY ("author_id") REFERENCES "authors"("id")
);