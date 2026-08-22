-- Copyright 2026 上海如静知华信息科技有限公司 · https://www.zhuatech.cn/
CREATE TABLE IF NOT EXISTS json_inspection_history(id BIGINT PRIMARY KEY AUTO_INCREMENT,fingerprint CHAR(64),root_type VARCHAR(24),node_count INT,created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP);
