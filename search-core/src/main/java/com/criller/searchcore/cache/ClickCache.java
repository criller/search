package com.criller.searchcore.cache;

/**
 * @author CaoCheng
 * @date 2018/8/29
 */
public class ClickCache {

  private ClickCache() {
  }

  private static class ClickCacheHolder {

    private static final ClickCache INSTANCE = new ClickCache();
  }

  public static ClickCache getInstance() {
    return ClickCacheHolder.INSTANCE;
  }

}
