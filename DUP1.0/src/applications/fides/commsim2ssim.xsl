<?xml version="1.0"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
	
  <xsl:variable name="NL">
    <xsl:text>
</xsl:text>
  </xsl:variable>

  <xsl:output method="text" indent="no"/>

  <xsl:template match="/commsim">
    <!-- do the one-of processes -->
    <xsl:variable name="manufacturerCount" select="count(manufacturer)"/>
    <xsl:variable name="consumerCount" select="count(consumer)"/>
    <xsl:variable name="retailerCount" select="count(retailer)"/>
    <xsl:variable name="processCount" select="count(manufacturer)+count(consumer)+count(retailer)"/>

    <xsl:text>M:</xsl:text>
    <xsl:value-of select="$manufacturerCount"/>
    <xsl:value-of select="$NL"/>
    <xsl:text>C:</xsl:text>
    <xsl:value-of select="$consumerCount"/>
    <xsl:value-of select="$NL"/>
    <xsl:text>R:</xsl:text>
    <xsl:value-of select="$retailerCount"/>
    <xsl:value-of select="$NL"/>
    <xsl:apply-templates select="manufacturer|retailer|consumer"/>
  </xsl:template>

  <xsl:template match="item" mode="manufacturer">
    <xsl:text> </xsl:text>
    <xsl:value-of select="@name"/>
    <xsl:text>:</xsl:text>
    <xsl:value-of select="@delay"/>
  </xsl:template>

  <xsl:template match="manufacturer">
    <xsl:value-of select="@name"/>
    <xsl:apply-templates select="item" mode="manufacturer"/>
    <xsl:text>;</xsl:text>
    <xsl:value-of select="$NL"/>
  </xsl:template>

  <xsl:template match="item" mode="retailer">
    <xsl:text> </xsl:text>
    <xsl:value-of select="@name"/>
    <xsl:text>:</xsl:text>
    <xsl:value-of select="@manufacturer"/>
    <xsl:text>:</xsl:text>
    <xsl:value-of select="@unitSize"/>
  </xsl:template>

  <xsl:template match="retailer">
    <xsl:value-of select="@name"/>
    <xsl:apply-templates select="item" mode="retailer"/>
    <xsl:text>;</xsl:text>
    <xsl:value-of select="$NL"/>
  </xsl:template>

  <xsl:template match="order">
    <xsl:text> </xsl:text>
    <xsl:value-of select="@retailer"/>
    <xsl:text>:</xsl:text>
    <xsl:value-of select="@item"/>
    <xsl:text>:</xsl:text>
    <xsl:value-of select="@quantity"/>
    <xsl:text>:</xsl:text>
    <xsl:value-of select="@delay"/>
  </xsl:template>

  <xsl:template match="consumer">
    <xsl:value-of select="@name"/>
    <xsl:apply-templates select="order"/>
    <xsl:text>;</xsl:text>
    <xsl:value-of select="$NL"/>
  </xsl:template>
  
  
</xsl:stylesheet>
