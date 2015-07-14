<?xml version="1.0"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">

  <xsl:variable name="NL">
    <xsl:text>
</xsl:text>
  </xsl:variable>

  <xsl:param name="machines">
    <xsl:value-of select="count(/dup_simulation/hosts/host)"/>
  </xsl:param>

  <xsl:param name="remote_dir">
    <xsl:value-of select="/dup_simulation/remote_data_dir"/>
  </xsl:param>
  
  <xsl:param name="sims_output_to_file">
    <xsl:value-of select="/dup_simulation/sims_output_to_file"/>
  </xsl:param>
  
  <xsl:param name="input_file">
    <xsl:value-of select="/dup_simulation/input_file"/>
  </xsl:param>
    
  <xsl:param name="remote_sims_output_file">
    <xsl:value-of select="/dup_simulation/remote_sims_output_file"/>
  </xsl:param>
      
  <xsl:param name="local_sims_output_file">
    <xsl:value-of select="/dup_simulation/local_sims_output_file"/>
  </xsl:param>
            
  <xsl:param name="ssh_username">
    <xsl:value-of select="/dup_simulation/ssh_username"/>
  </xsl:param>
  
  <xsl:param name="start_dupds">
    <xsl:value-of select="/dup_simulation/start_dupds"/>
  </xsl:param>

  <xsl:param name="local_hostname">
    <xsl:value-of select="/dup_simulation/local_hostname"/>
  </xsl:param>
  
  <xsl:param name="local_data_dir">
    <xsl:value-of select="/dup_simulation/local_data_dir"/>
  </xsl:param>
  
  <xsl:param name="remote_dup_path">
    <xsl:value-of select="/dup_simulation/remote_dup_path"/>
  </xsl:param>
  
  <xsl:output method="text" indent="no"/>

	<xsl:template match="/dup_simulation">
		<xsl:text>#!/bin/bash</xsl:text>
		<xsl:value-of select="$NL"/>
		<xsl:value-of select="$NL"/>
		<xsl:if test="/dup_simulation/copy_to_hosts = 1">
			<xsl:text>for i in </xsl:text>
			<xsl:apply-templates select="hosts/host" mode="names"/>
			<xsl:value-of select="$NL"/>
			<xsl:text>  do scp -r </xsl:text>
			<xsl:value-of select="$local_data_dir"/>
			<xsl:text> </xsl:text>
			<xsl:value-of select="$ssh_username"/>
			<xsl:text>@$i:</xsl:text>
			<xsl:value-of select="$remote_dir"/>
			<xsl:value-of select="$NL"/>
			<xsl:text>done</xsl:text>
			<xsl:value-of select="$NL"/>
		</xsl:if>
		
		<xsl:value-of select="$NL"/>
		<xsl:text>cat > temp_sim.dup &lt;&lt;EOF</xsl:text>
		<xsl:value-of select="$NL"/>
		<xsl:text>Lerror@</xsl:text>
		<xsl:value-of select="$local_hostname"/>
		<xsl:text>:55555[1|DUP:1, 2|DUP:2]\$faninany;</xsl:text>
		<xsl:value-of select="$NL"/>
		<xsl:text>Ldeal@</xsl:text>
		<xsl:value-of select="$local_hostname"/>
		<xsl:text>:55555[0&lt;</xsl:text>
		<xsl:value-of select="$local_data_dir"></xsl:value-of>
		<xsl:text>/</xsl:text>
		<xsl:value-of select="$input_file"></xsl:value-of>
		<xsl:text>, 2|Lerror:4</xsl:text>
		<xsl:apply-templates select="hosts/host" mode="deal"/>
		<xsl:text>]\$deal;</xsl:text>
		<xsl:value-of select="$NL"/>
		<xsl:apply-templates select="hosts/host" mode="cmd"/>
		
	  <xsl:if test="/dup_simulation/sims_output_to_stdout = 1">
	  	<xsl:text>Lfaninany@</xsl:text>
			<xsl:value-of select="$local_hostname"/>
			<xsl:text>:55555[1></xsl:text>
			<xsl:value-of select="$local_data_dir"/>
			<xsl:text>/</xsl:text>
			<xsl:value-of select="$local_sims_output_file"/>
			<xsl:text>]\$faninany;</xsl:text>
			<xsl:value-of select="$NL"/>
	  </xsl:if>
		<xsl:value-of select="$NL"/>
		<xsl:text>EOF</xsl:text>
		<xsl:value-of select="$NL"/>
		
		<xsl:if test="$start_dupds = 1">
			<xsl:text>login.py temp_sim.dup </xsl:text>
			<xsl:value-of select="$ssh_username"/>
			<xsl:text> </xsl:text>
			<xsl:value-of select="$local_hostname"/>
			<xsl:text> </xsl:text>
			<xsl:value-of select="$remote_dir"/>
			<xsl:text> </xsl:text>
			<xsl:value-of select="$remote_dup_path"/>
			<xsl:value-of select="$NL"/>
		</xsl:if>
		
		<xsl:text>dup -c temp_sim.dup</xsl:text>
		<xsl:text>rm temp_sim.dup</xsl:text>
		
		<xsl:if test="/dup_simulation/sims_output_to_file = 1">
			<xsl:text>for i in </xsl:text>
			<xsl:apply-templates select="hosts/host" mode="names"/>
			<xsl:value-of select="$NL"/>
			<xsl:text>  do scp </xsl:text>
			<xsl:value-of select="$ssh_username"/>
			<xsl:text>@$i:</xsl:text>
			<xsl:value-of select="$remote_dir"/>
			<xsl:text>/</xsl:text>
			<xsl:value-of select="$remote_sims_output_file"/>
			<xsl:text> </xsl:text>
			<xsl:value-of select="$local_data_dir"/>
			<xsl:text>/$i_</xsl:text>
			<xsl:value-of select="$local_sims_output_file"/>
			<xsl:value-of select="$NL"/>
			<xsl:text>done</xsl:text>
			<xsl:value-of select="$NL"/>
		</xsl:if>
	</xsl:template>

	<xsl:template match="host" mode="names">
		<xsl:value-of select="./hostname"/>
		<xsl:text> </xsl:text>
	</xsl:template>
	
	<xsl:template match="host" mode="deal">
		<xsl:text>, </xsl:text>
	  <xsl:value-of select="position() + 10"/>
	  <xsl:text>|client</xsl:text>
	  <xsl:value-of select="position()"/>
		<xsl:text>:0</xsl:text>
	</xsl:template>
	
	<xsl:template match="host" mode="cmd">
		<xsl:text>client</xsl:text>
	  <xsl:value-of select="position()"/>
	  <xsl:text>@</xsl:text>
	  <xsl:value-of select="./hostname"/>
	  <xsl:text>:</xsl:text>
	  <xsl:value-of select="./port"/>
	  <xsl:text>[2|Lerror:</xsl:text>
	  <xsl:value-of select="position() + 11"/>
	  <xsl:if test="/dup_simulation/sims_output_to_stdout = 1">
	  	<xsl:text>, 1|Lfaninany:</xsl:text>
	  	<xsl:value-of select="position() + 3"/>
	  </xsl:if>
	  <xsl:text>]\$cmd;</xsl:text>
	  <xsl:value-of select="$NL"/>
	</xsl:template>
</xsl:stylesheet>
