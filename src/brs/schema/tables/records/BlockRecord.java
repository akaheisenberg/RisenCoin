/*
 * This file is generated by jOOQ.
*/
package brs.schema.tables.records;


import brs.schema.tables.Block;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record20;
import org.jooq.Row20;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BlockRecord extends UpdatableRecordImpl<BlockRecord> implements Record20<Long, Long, Integer, Integer, Long, Long, Long, Integer, byte[], byte[], byte[], Long, Long, Integer, byte[], byte[], byte[], Long, Long, byte[]> {

    private static final long serialVersionUID = 1828297148;

    /**
     * Setter for <code>DB.block.db_id</code>.
     */
    public void setDbId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>DB.block.db_id</code>.
     */
    public Long getDbId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>DB.block.id</code>.
     */
    public void setId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>DB.block.id</code>.
     */
    public Long getId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>DB.block.version</code>.
     */
    public void setVersion(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>DB.block.version</code>.
     */
    public Integer getVersion() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>DB.block.timestamp</code>.
     */
    public void setTimestamp(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>DB.block.timestamp</code>.
     */
    public Integer getTimestamp() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>DB.block.previous_block_id</code>.
     */
    public void setPreviousBlockId(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>DB.block.previous_block_id</code>.
     */
    public Long getPreviousBlockId() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>DB.block.total_amount</code>.
     */
    public void setTotalAmount(Long value) {
        set(5, value);
    }

    /**
     * Getter for <code>DB.block.total_amount</code>.
     */
    public Long getTotalAmount() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>DB.block.total_fee</code>.
     */
    public void setTotalFee(Long value) {
        set(6, value);
    }

    /**
     * Getter for <code>DB.block.total_fee</code>.
     */
    public Long getTotalFee() {
        return (Long) get(6);
    }

    /**
     * Setter for <code>DB.block.payload_length</code>.
     */
    public void setPayloadLength(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>DB.block.payload_length</code>.
     */
    public Integer getPayloadLength() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>DB.block.generator_public_key</code>.
     */
    public void setGeneratorPublicKey(byte... value) {
        set(8, value);
    }

    /**
     * Getter for <code>DB.block.generator_public_key</code>.
     */
    public byte[] getGeneratorPublicKey() {
        return (byte[]) get(8);
    }

    /**
     * Setter for <code>DB.block.previous_block_hash</code>.
     */
    public void setPreviousBlockHash(byte... value) {
        set(9, value);
    }

    /**
     * Getter for <code>DB.block.previous_block_hash</code>.
     */
    public byte[] getPreviousBlockHash() {
        return (byte[]) get(9);
    }

    /**
     * Setter for <code>DB.block.cumulative_difficulty</code>.
     */
    public void setCumulativeDifficulty(byte... value) {
        set(10, value);
    }

    /**
     * Getter for <code>DB.block.cumulative_difficulty</code>.
     */
    public byte[] getCumulativeDifficulty() {
        return (byte[]) get(10);
    }

    /**
     * Setter for <code>DB.block.base_target</code>.
     */
    public void setBaseTarget(Long value) {
        set(11, value);
    }

    /**
     * Getter for <code>DB.block.base_target</code>.
     */
    public Long getBaseTarget() {
        return (Long) get(11);
    }

    /**
     * Setter for <code>DB.block.next_block_id</code>.
     */
    public void setNextBlockId(Long value) {
        set(12, value);
    }

    /**
     * Getter for <code>DB.block.next_block_id</code>.
     */
    public Long getNextBlockId() {
        return (Long) get(12);
    }

    /**
     * Setter for <code>DB.block.height</code>.
     */
    public void setHeight(Integer value) {
        set(13, value);
    }

    /**
     * Getter for <code>DB.block.height</code>.
     */
    public Integer getHeight() {
        return (Integer) get(13);
    }

    /**
     * Setter for <code>DB.block.generation_signature</code>.
     */
    public void setGenerationSignature(byte... value) {
        set(14, value);
    }

    /**
     * Getter for <code>DB.block.generation_signature</code>.
     */
    public byte[] getGenerationSignature() {
        return (byte[]) get(14);
    }

    /**
     * Setter for <code>DB.block.block_signature</code>.
     */
    public void setBlockSignature(byte... value) {
        set(15, value);
    }

    /**
     * Getter for <code>DB.block.block_signature</code>.
     */
    public byte[] getBlockSignature() {
        return (byte[]) get(15);
    }

    /**
     * Setter for <code>DB.block.payload_hash</code>.
     */
    public void setPayloadHash(byte... value) {
        set(16, value);
    }

    /**
     * Getter for <code>DB.block.payload_hash</code>.
     */
    public byte[] getPayloadHash() {
        return (byte[]) get(16);
    }

    /**
     * Setter for <code>DB.block.generator_id</code>.
     */
    public void setGeneratorId(Long value) {
        set(17, value);
    }

    /**
     * Getter for <code>DB.block.generator_id</code>.
     */
    public Long getGeneratorId() {
        return (Long) get(17);
    }

    /**
     * Setter for <code>DB.block.nonce</code>.
     */
    public void setNonce(Long value) {
        set(18, value);
    }

    /**
     * Getter for <code>DB.block.nonce</code>.
     */
    public Long getNonce() {
        return (Long) get(18);
    }

    /**
     * Setter for <code>DB.block.ats</code>.
     */
    public void setAts(byte... value) {
        set(19, value);
    }

    /**
     * Getter for <code>DB.block.ats</code>.
     */
    public byte[] getAts() {
        return (byte[]) get(19);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record20 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row20<Long, Long, Integer, Integer, Long, Long, Long, Integer, byte[], byte[], byte[], Long, Long, Integer, byte[], byte[], byte[], Long, Long, byte[]> fieldsRow() {
        return (Row20) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row20<Long, Long, Integer, Integer, Long, Long, Long, Integer, byte[], byte[], byte[], Long, Long, Integer, byte[], byte[], byte[], Long, Long, byte[]> valuesRow() {
        return (Row20) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return Block.BLOCK.DB_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return Block.BLOCK.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return Block.BLOCK.VERSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return Block.BLOCK.TIMESTAMP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field5() {
        return Block.BLOCK.PREVIOUS_BLOCK_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field6() {
        return Block.BLOCK.TOTAL_AMOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field7() {
        return Block.BLOCK.TOTAL_FEE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return Block.BLOCK.PAYLOAD_LENGTH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<byte[]> field9() {
        return Block.BLOCK.GENERATOR_PUBLIC_KEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<byte[]> field10() {
        return Block.BLOCK.PREVIOUS_BLOCK_HASH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<byte[]> field11() {
        return Block.BLOCK.CUMULATIVE_DIFFICULTY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field12() {
        return Block.BLOCK.BASE_TARGET;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field13() {
        return Block.BLOCK.NEXT_BLOCK_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field14() {
        return Block.BLOCK.HEIGHT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<byte[]> field15() {
        return Block.BLOCK.GENERATION_SIGNATURE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<byte[]> field16() {
        return Block.BLOCK.BLOCK_SIGNATURE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<byte[]> field17() {
        return Block.BLOCK.PAYLOAD_HASH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field18() {
        return Block.BLOCK.GENERATOR_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field19() {
        return Block.BLOCK.NONCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<byte[]> field20() {
        return Block.BLOCK.ATS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getDbId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component2() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getTimestamp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component5() {
        return getPreviousBlockId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component6() {
        return getTotalAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component7() {
        return getTotalFee();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component8() {
        return getPayloadLength();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] component9() {
        return getGeneratorPublicKey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] component10() {
        return getPreviousBlockHash();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] component11() {
        return getCumulativeDifficulty();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component12() {
        return getBaseTarget();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component13() {
        return getNextBlockId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component14() {
        return getHeight();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] component15() {
        return getGenerationSignature();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] component16() {
        return getBlockSignature();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] component17() {
        return getPayloadHash();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component18() {
        return getGeneratorId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component19() {
        return getNonce();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] component20() {
        return getAts();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getDbId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getVersion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getTimestamp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value5() {
        return getPreviousBlockId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value6() {
        return getTotalAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value7() {
        return getTotalFee();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getPayloadLength();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] value9() {
        return getGeneratorPublicKey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] value10() {
        return getPreviousBlockHash();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] value11() {
        return getCumulativeDifficulty();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value12() {
        return getBaseTarget();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value13() {
        return getNextBlockId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value14() {
        return getHeight();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] value15() {
        return getGenerationSignature();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] value16() {
        return getBlockSignature();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] value17() {
        return getPayloadHash();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value18() {
        return getGeneratorId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value19() {
        return getNonce();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] value20() {
        return getAts();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BlockRecord value1(Long value) {
        setDbId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BlockRecord value2(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BlockRecord value3(Integer value) {
        setVersion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BlockRecord value4(Integer value) {
        setTimestamp(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BlockRecord value5(Long value) {
        setPreviousBlockId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BlockRecord value6(Long value) {
        setTotalAmount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BlockRecord value7(Long value) {
        setTotalFee(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BlockRecord value8(Integer value) {
        setPayloadLength(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BlockRecord value9(byte... value) {
        setGeneratorPublicKey(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BlockRecord value10(byte... value) {
        setPreviousBlockHash(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BlockRecord value11(byte... value) {
        setCumulativeDifficulty(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BlockRecord value12(Long value) {
        setBaseTarget(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BlockRecord value13(Long value) {
        setNextBlockId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BlockRecord value14(Integer value) {
        setHeight(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BlockRecord value15(byte... value) {
        setGenerationSignature(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BlockRecord value16(byte... value) {
        setBlockSignature(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BlockRecord value17(byte... value) {
        setPayloadHash(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BlockRecord value18(Long value) {
        setGeneratorId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BlockRecord value19(Long value) {
        setNonce(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BlockRecord value20(byte... value) {
        setAts(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BlockRecord values(Long value1, Long value2, Integer value3, Integer value4, Long value5, Long value6, Long value7, Integer value8, byte[] value9, byte[] value10, byte[] value11, Long value12, Long value13, Integer value14, byte[] value15, byte[] value16, byte[] value17, Long value18, Long value19, byte[] value20) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        value17(value17);
        value18(value18);
        value19(value19);
        value20(value20);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached BlockRecord
     */
    public BlockRecord() {
        super(Block.BLOCK);
    }

    /**
     * Create a detached, initialised BlockRecord
     */
    public BlockRecord(Long dbId, Long id, Integer version, Integer timestamp, Long previousBlockId, Long totalAmount, Long totalFee, Integer payloadLength, byte[] generatorPublicKey, byte[] previousBlockHash, byte[] cumulativeDifficulty, Long baseTarget, Long nextBlockId, Integer height, byte[] generationSignature, byte[] blockSignature, byte[] payloadHash, Long generatorId, Long nonce, byte[] ats) {
        super(Block.BLOCK);

        set(0, dbId);
        set(1, id);
        set(2, version);
        set(3, timestamp);
        set(4, previousBlockId);
        set(5, totalAmount);
        set(6, totalFee);
        set(7, payloadLength);
        set(8, generatorPublicKey);
        set(9, previousBlockHash);
        set(10, cumulativeDifficulty);
        set(11, baseTarget);
        set(12, nextBlockId);
        set(13, height);
        set(14, generationSignature);
        set(15, blockSignature);
        set(16, payloadHash);
        set(17, generatorId);
        set(18, nonce);
        set(19, ats);
    }
}
