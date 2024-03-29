package com.insuranceapp.repository;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.insuranceapp.exception.InsuranceNotFoundException;
import com.insuranceapp.model.Insurance;
@Mapper
public interface IInsuranceRepository {
	@Insert("insert into Insurance(policy_name,brand,insurance_type,duration,premiun)values(#{policyname},#{brand},#{type},#{duration},#{premiun})")
	void addInsurance(Insurance insurance);
	@Update("update insurance set premiun=#{premiun} where insurance_id=#{insuranceId}")
	void updateInsurance(int insuranceId,double premiun);
	@Delete("delete from Insurance where insurance_id=#{insuranceId}")
	void deleteInsurance(int insuranceId);
	
	@Select("select * from Insurance")
//	@Results(@Result(property="insuranceId",column="insurance_id"),
//			@Result(property = "policyname",column="policy_name")
	List<Insurance>getAll();
	
	@Select("select * from Insurance where brand=#{brand}")
	List<Insurance>getByBrand(String brand)throws InsuranceNotFoundException;
	
	List<Insurance>getByBrandAndType(String brand,String type)throws InsuranceNotFoundException;
	
	List<Insurance>getByTypeAndLesserPremiun(String type, double premium)throws InsuranceNotFoundException;
	
	@Select("select * from Insurance where insurance_id=#{insuranceId}")
	Insurance getById(int insuranceId)throws InsuranceNotFoundException;
	
}
