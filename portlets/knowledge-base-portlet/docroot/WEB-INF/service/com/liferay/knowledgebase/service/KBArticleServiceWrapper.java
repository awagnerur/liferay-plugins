/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.knowledgebase.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link KBArticleService}.
 *
 * @author Brian Wing Shun Chan
 * @see KBArticleService
 * @generated
 */
public class KBArticleServiceWrapper implements KBArticleService,
	ServiceWrapper<KBArticleService> {
	public KBArticleServiceWrapper(KBArticleService kbArticleService) {
		_kbArticleService = kbArticleService;
	}

	@Override
	public void addAttachment(java.lang.String portletId, long resourcePrimKey,
		java.lang.String dirName, java.lang.String shortFileName,
		java.io.InputStream inputStream,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {
		_kbArticleService.addAttachment(portletId, resourcePrimKey, dirName,
			shortFileName, inputStream, serviceContext);
	}

	@Override
	public com.liferay.knowledgebase.model.KBArticle addKBArticle(
		java.lang.String portletId, long parentResourcePrimKey,
		java.lang.String title, java.lang.String urlTitle,
		java.lang.String content, java.lang.String description,
		java.lang.String[] sections, java.lang.String dirName,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _kbArticleService.addKBArticle(portletId, parentResourcePrimKey,
			title, urlTitle, content, description, sections, dirName,
			serviceContext);
	}

	@Override
	public void addKBArticlesMarkdown(long groupId, java.lang.String fileName,
		java.io.InputStream inputStream,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {
		_kbArticleService.addKBArticlesMarkdown(groupId, fileName, inputStream,
			serviceContext);
	}

	@Override
	public void deleteAttachment(long companyId, long groupId,
		java.lang.String portletId, long resourcePrimKey,
		java.lang.String fileName)
		throws com.liferay.portal.kernel.exception.PortalException {
		_kbArticleService.deleteAttachment(companyId, groupId, portletId,
			resourcePrimKey, fileName);
	}

	@Override
	public com.liferay.knowledgebase.model.KBArticle deleteKBArticle(
		long resourcePrimKey)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _kbArticleService.deleteKBArticle(resourcePrimKey);
	}

	@Override
	public void deleteKBArticles(long groupId, long[] resourcePrimKeys)
		throws com.liferay.portal.kernel.exception.PortalException {
		_kbArticleService.deleteKBArticles(groupId, resourcePrimKeys);
	}

	@Override
	public java.io.File getAttachment(long companyId, long groupId,
		java.lang.String portletId, long resourcePrimKey,
		java.lang.String fileName)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _kbArticleService.getAttachment(companyId, groupId, portletId,
			resourcePrimKey, fileName);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _kbArticleService.getBeanIdentifier();
	}

	@Override
	public java.util.List<com.liferay.knowledgebase.model.KBArticle> getGroupKBArticles(
		long groupId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.knowledgebase.model.KBArticle> orderByComparator) {
		return _kbArticleService.getGroupKBArticles(groupId, status, start,
			end, orderByComparator);
	}

	@Override
	public int getGroupKBArticlesCount(long groupId, int status) {
		return _kbArticleService.getGroupKBArticlesCount(groupId, status);
	}

	@Override
	public java.lang.String getGroupKBArticlesRSS(int status, int rssDelta,
		java.lang.String rssDisplayStyle, java.lang.String rssFormat,
		com.liferay.portal.theme.ThemeDisplay themeDisplay)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _kbArticleService.getGroupKBArticlesRSS(status, rssDelta,
			rssDisplayStyle, rssFormat, themeDisplay);
	}

	@Override
	public com.liferay.knowledgebase.model.KBArticle getKBArticle(
		long resourcePrimKey, int version)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _kbArticleService.getKBArticle(resourcePrimKey, version);
	}

	@Override
	public java.util.List<com.liferay.knowledgebase.model.KBArticle> getKBArticleAndAllDescendantKBArticles(
		long groupId, long resourcePrimKey, int status,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.knowledgebase.model.KBArticle> orderByComparator) {
		return _kbArticleService.getKBArticleAndAllDescendantKBArticles(groupId,
			resourcePrimKey, status, orderByComparator);
	}

	/**
	* @deprecated As of 7.0.0, replaced by
	{@link #getKBArticleAndAllDescendantKBArticles(long, long,
	int, com.liferay.portal.kernel.util.OrderByComparator)}
	*/
	@Override
	public java.util.List<com.liferay.knowledgebase.model.KBArticle> getKBArticleAndAllDescendants(
		long groupId, long resourcePrimKey, int status,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.knowledgebase.model.KBArticle> orderByComparator) {
		return _kbArticleService.getKBArticleAndAllDescendants(groupId,
			resourcePrimKey, status, orderByComparator);
	}

	@Override
	public java.lang.String getKBArticleRSS(long resourcePrimKey, int status,
		int rssDelta, java.lang.String rssDisplayStyle,
		java.lang.String rssFormat,
		com.liferay.portal.theme.ThemeDisplay themeDisplay)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _kbArticleService.getKBArticleRSS(resourcePrimKey, status,
			rssDelta, rssDisplayStyle, rssFormat, themeDisplay);
	}

	@Override
	public com.liferay.knowledgebase.model.KBArticleSearchDisplay getKBArticleSearchDisplay(
		long groupId, java.lang.String title, java.lang.String content,
		int status, java.util.Date startDate, java.util.Date endDate,
		boolean andOperator, int[] curStartValues, int cur, int delta,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.knowledgebase.model.KBArticle> orderByComparator)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _kbArticleService.getKBArticleSearchDisplay(groupId, title,
			content, status, startDate, endDate, andOperator, curStartValues,
			cur, delta, orderByComparator);
	}

	@Override
	public java.util.List<com.liferay.knowledgebase.model.KBArticle> getKBArticleVersions(
		long groupId, long resourcePrimKey, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.knowledgebase.model.KBArticle> orderByComparator) {
		return _kbArticleService.getKBArticleVersions(groupId, resourcePrimKey,
			status, start, end, orderByComparator);
	}

	@Override
	public int getKBArticleVersionsCount(long groupId, long resourcePrimKey,
		int status) {
		return _kbArticleService.getKBArticleVersionsCount(groupId,
			resourcePrimKey, status);
	}

	@Override
	public java.util.List<com.liferay.knowledgebase.model.KBArticle> getKBArticles(
		long groupId, long parentResourcePrimKey, int status, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.knowledgebase.model.KBArticle> orderByComparator) {
		return _kbArticleService.getKBArticles(groupId, parentResourcePrimKey,
			status, start, end, orderByComparator);
	}

	@Override
	public java.util.List<com.liferay.knowledgebase.model.KBArticle> getKBArticles(
		long groupId, long[] resourcePrimKeys, int status,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.knowledgebase.model.KBArticle> orderByComparator) {
		return _kbArticleService.getKBArticles(groupId, resourcePrimKeys,
			status, orderByComparator);
	}

	@Override
	public java.util.List<com.liferay.knowledgebase.model.KBArticle> getKBArticles(
		long groupId, long[] resourcePrimKeys, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.knowledgebase.model.KBArticle> orderByComparator) {
		return _kbArticleService.getKBArticles(groupId, resourcePrimKeys,
			status, start, end, orderByComparator);
	}

	@Override
	public int getKBArticlesCount(long groupId, long parentResourcePrimKey,
		int status) {
		return _kbArticleService.getKBArticlesCount(groupId,
			parentResourcePrimKey, status);
	}

	@Override
	public int getKBArticlesCount(long groupId, long[] resourcePrimKeys,
		int status) {
		return _kbArticleService.getKBArticlesCount(groupId, resourcePrimKeys,
			status);
	}

	@Override
	public com.liferay.knowledgebase.model.KBArticle getLatestKBArticle(
		long resourcePrimKey, int status)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _kbArticleService.getLatestKBArticle(resourcePrimKey, status);
	}

	@Override
	public java.util.List<com.liferay.knowledgebase.model.KBArticle> getSectionsKBArticles(
		long groupId, java.lang.String[] sections, int status, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.knowledgebase.model.KBArticle> orderByComparator) {
		return _kbArticleService.getSectionsKBArticles(groupId, sections,
			status, start, end, orderByComparator);
	}

	@Override
	public int getSectionsKBArticlesCount(long groupId,
		java.lang.String[] sections, int status) {
		return _kbArticleService.getSectionsKBArticlesCount(groupId, sections,
			status);
	}

	/**
	* @deprecated As of 7.0.0, replaced by {@link #getKBArticles(long, long,
	int, int, int,
	com.liferay.portal.kernel.util.OrderByComparator)}
	*/
	@Override
	public java.util.List<com.liferay.knowledgebase.model.KBArticle> getSiblingKBArticles(
		long groupId, long parentResourcePrimKey, int status, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.knowledgebase.model.KBArticle> orderByComparator) {
		return _kbArticleService.getSiblingKBArticles(groupId,
			parentResourcePrimKey, status, start, end, orderByComparator);
	}

	/**
	* @deprecated As of 7.0.0, replaced by {@link #getKBArticlesCount(long,
	long, int)}
	*/
	@Override
	public int getSiblingKBArticlesCount(long groupId,
		long parentResourcePrimKey, int status) {
		return _kbArticleService.getSiblingKBArticlesCount(groupId,
			parentResourcePrimKey, status);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _kbArticleService.invokeMethod(name, parameterTypes, arguments);
	}

	@Override
	public void moveKBArticle(long resourcePrimKey, long parentResourcePrimKey,
		double priority)
		throws com.liferay.portal.kernel.exception.PortalException {
		_kbArticleService.moveKBArticle(resourcePrimKey, parentResourcePrimKey,
			priority);
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_kbArticleService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public void subscribeGroupKBArticles(long groupId,
		java.lang.String portletId)
		throws com.liferay.portal.kernel.exception.PortalException {
		_kbArticleService.subscribeGroupKBArticles(groupId, portletId);
	}

	@Override
	public void subscribeKBArticle(long groupId, long resourcePrimKey)
		throws com.liferay.portal.kernel.exception.PortalException {
		_kbArticleService.subscribeKBArticle(groupId, resourcePrimKey);
	}

	@Override
	public void unsubscribeGroupKBArticles(long groupId,
		java.lang.String portletId)
		throws com.liferay.portal.kernel.exception.PortalException {
		_kbArticleService.unsubscribeGroupKBArticles(groupId, portletId);
	}

	@Override
	public void unsubscribeKBArticle(long resourcePrimKey)
		throws com.liferay.portal.kernel.exception.PortalException {
		_kbArticleService.unsubscribeKBArticle(resourcePrimKey);
	}

	@Override
	public java.lang.String updateAttachments(java.lang.String portletId,
		long resourcePrimKey, java.lang.String dirName,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _kbArticleService.updateAttachments(portletId, resourcePrimKey,
			dirName, serviceContext);
	}

	@Override
	public com.liferay.knowledgebase.model.KBArticle updateKBArticle(
		long resourcePrimKey, java.lang.String title, java.lang.String content,
		java.lang.String description, java.lang.String[] sections,
		java.lang.String dirName,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _kbArticleService.updateKBArticle(resourcePrimKey, title,
			content, description, sections, dirName, serviceContext);
	}

	@Override
	public void updateKBArticlesPriorities(long groupId,
		java.util.Map<java.lang.Long, java.lang.Double> resourcePrimKeyToPriorityMap)
		throws com.liferay.portal.kernel.exception.PortalException {
		_kbArticleService.updateKBArticlesPriorities(groupId,
			resourcePrimKeyToPriorityMap);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	@Deprecated
	public KBArticleService getWrappedKBArticleService() {
		return _kbArticleService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	@Deprecated
	public void setWrappedKBArticleService(KBArticleService kbArticleService) {
		_kbArticleService = kbArticleService;
	}

	@Override
	public KBArticleService getWrappedService() {
		return _kbArticleService;
	}

	@Override
	public void setWrappedService(KBArticleService kbArticleService) {
		_kbArticleService = kbArticleService;
	}

	private KBArticleService _kbArticleService;
}