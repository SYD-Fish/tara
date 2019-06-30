package com.syd.goods.mapper;

import com.syd.goods.model.ContactModel;
import java.util.List;

public interface ContactMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contact
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer contactId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contact
     *
     * @mbg.generated
     */
    int insert(ContactModel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contact
     *
     * @mbg.generated
     */
    ContactModel selectByPrimaryKey(Integer contactId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contact
     *
     * @mbg.generated
     */
    List<ContactModel> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table contact
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(ContactModel record);
}