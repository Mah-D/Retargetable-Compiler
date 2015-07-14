<?xml version="1.0"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">

  <xsl:variable name="NL">
    <xsl:text>
</xsl:text>
  </xsl:variable>

  <xsl:param name="consumer_number">
    <xsl:value-of select="0"/>
  </xsl:param>
  <xsl:param name="consumers">
    <xsl:value-of select="count(/commsim/consumer)"/>
  </xsl:param>
  
  <xsl:output method="text" indent="no"/>
  
  <xsl:template match="/commsim">
    <xsl:apply-templates select="consumer" /> 
  </xsl:template>

  <xsl:template match="order">
		<xsl:if test="position() &gt; 1">
      <xsl:text>,</xsl:text>
    </xsl:if>
    <xsl:value-of select="@retailer"/>
    <xsl:text>:</xsl:text>
    <xsl:value-of select="@item"/>
    <xsl:text>:</xsl:text>
    <xsl:value-of select="@quantity"/>
    <xsl:text>:</xsl:text>
    <xsl:value-of select="@delay"/>
  </xsl:template>

  <xsl:template match="consumer">
		<xsl:variable name="counter" select="count(preceding-sibling::consumer)" />
    <xsl:variable name="total" select="count(../consumer)"/>
 		<xsl:variable name="modval" select="floor(count(../consumer) div $consumers)" />
    <xsl:variable name="modnum" select="$counter mod $modval" />

		<xsl:if test="($counter &lt; (($consumer_number + 1) * $modval)) and ($counter >= ($consumer_number * $modval))"> 
	    <xsl:value-of select="@name"/>
	    <xsl:text>|</xsl:text>
	    <xsl:apply-templates select="order"/>
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
