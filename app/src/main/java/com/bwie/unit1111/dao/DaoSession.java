package com.bwie.unit1111.dao;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.bwie.unit1111.Bean.HistoricalBean;

import com.bwie.unit1111.dao.HistoricalBeanDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig historicalBeanDaoConfig;

    private final HistoricalBeanDao historicalBeanDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        historicalBeanDaoConfig = daoConfigMap.get(HistoricalBeanDao.class).clone();
        historicalBeanDaoConfig.initIdentityScope(type);

        historicalBeanDao = new HistoricalBeanDao(historicalBeanDaoConfig, this);

        registerDao(HistoricalBean.class, historicalBeanDao);
    }
    
    public void clear() {
        historicalBeanDaoConfig.clearIdentityScope();
    }

    public HistoricalBeanDao getHistoricalBeanDao() {
        return historicalBeanDao;
    }

}
