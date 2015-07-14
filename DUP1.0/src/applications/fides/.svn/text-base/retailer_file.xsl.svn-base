<?xml version="1.0"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">

  <xsl:variable name="NL">
    <xsl:text>
</xsl:text>
  </xsl:variable>

  <xsl:param name="retailer_number">
    <xsl:value-of select="0"/>
  </xsl:param>
  <xsl:param name="retailers">
    <xsl:value-of select="count(/commsim/retailer)"/>
  </xsl:param>
  
  <xsl:output method="text" indent="no"/>
  
  <xsl:template match="/commsim">
    <xsl:apply-templates select="retailer" /> 
  </xsl:template>

  <xsl:template match="item" mode="retailer">
		<xsl:if test="position() &gt; 1">
      <xsl:text>,</xsl:text>
    </xsl:if>
    <xsl:value-of select="@name"/>
    <xsl:text>:</xsl:text>
    <xsl:value-of select="@manufacturer"/>
    <xsl:text>:</xsl:text>
    <xsl:value-of select="@unitSize"/>
  </xsl:template>

  <xsl:template match="retailer">
		<xsl:variable name="counter" select="count(preceding-sibling::retailer)" />
    <xsl:variable name="total" select="count(../retailer)"/>
 		<xsl:variable name="modval" select="floor(count(../retailer) div $retailers)" />
    <xsl:variable name="modnum" select="$counter mod $modval" />
    
 		<xsl:if test="($counter &lt; (($retailer_number + 1) * $modval)) and ($counter >= ($retailer_number * $modval))"> 
	    <xsl:value-of select="@name"/>
	    <xsl:text>|</xsl:text>
	    <xsl:apply-templates select="item" mode="retailer"/>
	    <xsl:text> </xsl:text>
	    <xsl:choose>
		    <xsl:when test="$modnum = $modval - 1">
		    	<xsl:value-of select="$NL"/>
		    </xsl:when>
		    <xsl:when test="$counter = $total - 1">
		    	<xsl:value-of select="$NL"/>
		    </xsl:when>
	    </xsl:choose>
		</xsl:if>
  </xsl:template>

</xsl:stylesheet>
