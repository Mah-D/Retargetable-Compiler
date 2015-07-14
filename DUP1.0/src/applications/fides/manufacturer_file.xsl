<?xml version="1.0"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">

  <xsl:variable name="NL">
    <xsl:text>
</xsl:text>
  </xsl:variable>

  <xsl:param name="manufacturer_number">
    <xsl:value-of select="0"/>
  </xsl:param>
  <xsl:param name="manufacturers">
    <xsl:value-of select="count(/commsim/manufacturer)"/>
  </xsl:param>
  
  <xsl:output method="text" indent="no"/>
  
  <xsl:template match="/commsim">
    <xsl:apply-templates select="manufacturer" /> 
  </xsl:template>

  <xsl:template match="item" mode="manufacturer">
    <xsl:if test="position() &gt; 1">
      <xsl:text>,</xsl:text>
    </xsl:if>
    <xsl:value-of select="@name"/>
    <xsl:text>:</xsl:text>
    <xsl:value-of select="@delay"/>
  </xsl:template>

  <xsl:template match="manufacturer">
		<xsl:variable name="counter" select="count(preceding-sibling::manufacturer)" />
    <xsl:variable name="total" select="count(../manufacturer)"/>
 		<xsl:variable name="modval" select="floor(count(../manufacturer) div $manufacturers)" />
    <xsl:variable name="modnum" select="$counter mod $modval" />
		<xsl:if test="($counter &lt; (($manufacturer_number + 1) * $modval)) and ($counter >= ($manufacturer_number * $modval))"> 
	    <xsl:value-of select="@name"/>
	    <xsl:text>|</xsl:text>
   	<xsl:apply-templates select="item" mode="manufacturer"/>
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
