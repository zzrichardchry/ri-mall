package com.rick.mall.rimallcommon.service;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @Author zhuhaotian
 * @Date 2023/7/20
 */

public interface RedisService {

    /**
     * Save Attributes
     */
    void set(String key, Object value, long time);

    /**
     * Save Attributes
     */
    void set(String key, Object value);

    /**
     * Get Attributes
     */
    Object get(String key);

    /**
     * Delete Attributes
     */
    Boolean del(String key);

    /**
     * Delete Attributes
     */
    Long del(List<String> key);

    /**
     * Set Expiration Time
     */
    Boolean expire(String key, long time);

    /**
     * Get Expiration Time
     */
    Long getExpire(String key);

    /**
     * Contains Key?
     */
    Boolean hasKey(String key);

    /**
     * Increase by delta
     */
    Long incr(String key, long delta);

    /**
     * Decrease by delta
     */
    Long decr(String key, long delta);

    /**
     * Get Attribute in Hash Structure
     */
    Object hGet(String key, String hashKey);

    /**
     * Put an Attribute into the Hash Structure
     */
    Boolean hSet(String key, String hashKey, Object value, long time);

    /**
     * Put an Attribute into the Hash Structure
     */
    void hSet(String key, String hashKey, Object value);

    /**
     * Obtain the Whole Hash Structure
     */
    Map<Object, Object> hGetAll(String key);

    /**
     * Set the Whole Hash Structure
     */
    Boolean hSetAll(String key, Map<String, Object> map, long time);

    /**
     * Set the Whole Hash Structure
     */
    void hSetAll(String key, Map<String, ?> map);

    /**
     * Delete Hash Attribute
     */
    void hDel(String key, Object... hashKey);

    /**
     * Contains this Attribute in the Hash?
     */
    Boolean hHasKey(String key, String hashKey);

    /**
     * Increase Attributes in Hash
     */
    Long hIncr(String key, String hashKey, Long delta);

    /**
     * Decrease Attributes in Hash
     */
    Long hDecr(String key, String hashKey, Long delta);

    /**
     * Get HashSet
     */
    Set<Object> sMembers(String key);

    /**
     * Add Attributes to HashSet
     */
    Long sAdd(String key, Object... values);

    /**
     * Add Attributes to HashSet
     */
    Long sAdd(String key, long time, Object... values);

    /**
     * Set Contains key?
     */
    Boolean sIsMember(String key, Object value);

    /**
     * Get size of HashSet
     */
    Long sSize(String key);

    /**
     * Delete attributes in HashSet
     */
    Long sRemove(String key, Object... values);

    /**
     * Get Attributes in List
     */
    List<Object> lRange(String key, long start, long end);

    /**
     * Get size of the List
     */
    Long lSize(String key);

    /**
     * Get Attributes by Index
     */
    Object lIndex(String key, long index);

    /**
     * Add Attributes to List
     */
    Long lPush(String key, Object value);

    /**
     * Add Attributes to List
     */
    Long lPush(String key, Object value, long time);

    /**
     * Add Attributes to List
     */
    Long lPushAll(String key, Object... values);

    /**
     * Add Attributes to List
     */
    Long lPushAll(String key, Long time, Object... values);

    /**
     * Remove Attributes in List
     */
    Long lRemove(String key, long count, Object value);
}
