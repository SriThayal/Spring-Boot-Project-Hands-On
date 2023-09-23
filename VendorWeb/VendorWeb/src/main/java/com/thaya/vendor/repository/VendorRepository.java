package com.thaya.vendor.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thaya.vendor.entities.Vendor;

public interface VendorRepository extends JpaRepository<Vendor, Integer> {

}
