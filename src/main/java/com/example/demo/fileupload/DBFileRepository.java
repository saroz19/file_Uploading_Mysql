package com.example.demo.fileupload;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DBFileRepository extends JpaRepository<DBFile, String> {

}
