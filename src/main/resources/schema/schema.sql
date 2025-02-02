CREATE TABLE IF NOT EXISTS user_app
(
    id         SERIAL NOT NULL,
    username   VARCHAR(255),
    password   VARCHAR(255),
    dni        VARCHAR(100) UNIQUE,
    created_at TIMESTAMP DEFAULT now(),
    CONSTRAINT pk_customer_id PRIMARY KEY (id)
);


CREATE TABLE IF NOT EXISTS transfer
(
    id          SERIAL       NOT NULL,
    username    VARCHAR(255) NOT NULL,
    dni         VARCHAR(255) NOT NULL,
    amount      NUMERIC      NOT NULL,
    description VARCHAR(255),
    status      VARCHAR(80),
    addressee   VARCHAR(255) NOT NULL,
    created_at  TIMESTAMP DEFAULT now(),
    modified_at TIMESTAMP,
    CONSTRAINT pk_transaction_id PRIMARY KEY (id)
);

COMMENT ON column transfer.addressee is 'Store that receives the transfer';