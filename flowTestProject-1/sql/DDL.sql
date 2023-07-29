CREATE TABLE item.item_list (
	"name" varchar(20) NULL,
	"type" char(1) NULL DEFAULT 'C',
	reg_dt timestamp NULL DEFAULT CURRENT_TIMESTAMP,
	use_yn char(1) NULL DEFAULT 'Y'
);

-- Column comments

COMMENT ON COLUMN item.item_list."type" IS 'C : 커스텀 / D : 기본';
COMMENT ON COLUMN item.item_list.use_yn IS 'D 일때만 동작';

ALTER TABLE item.item_list ADD CONSTRAINT item_list_pk PRIMARY KEY ("name");
